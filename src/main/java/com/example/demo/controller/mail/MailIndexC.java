package com.example.demo.controller.mail;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;

import org.springframework.http.HttpHeaders;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.logging.ManagementLoggerFactory;
import com.example.demo.util.CustomCollectionValidator;
import com.example.demo.util.FormatValidator;

import lombok.RequiredArgsConstructor;

import com.example.demo.dto.mail.MailIndexDTO;
import com.example.demo.dto.mail.MailIndexResponseDTO;



@RestController
@RequestMapping("/mail/")
@RequiredArgsConstructor
public class MailIndexC {
	
	private final CustomCollectionValidator customCollectionValidator;	
	private final FormatValidator formatValidator;
	
	private final Logger logger = ManagementLoggerFactory.getLogger(MailIndexC.class);
	
	//메일인덱스재색인
	@RequestMapping(method = RequestMethod.POST, value = "updateMailIndexByUserInfo")
	public MailIndexResponseDTO.Response updateMailIndexByUserInfoC(
											 @RequestHeader HttpHeaders requestHeader
											,@RequestBody List<MailIndexDTO.UpdatebyUserInfoDTO> updateMailIndexInfoList
									        ,BindingResult BindingResult
										  ){
		
		MailIndexResponseDTO.Response mailIndexResponse = new MailIndexResponseDTO.Response();
		
		//메일인덱스재색인 입력값 Validation
		logger.info("Start MailIndex Parameter Validation [updateMailIndexByUserInfo] ========================");
		
		//메일인덱스재색인 입력값 Validation
		logger.info("Start MailIndex Parameter Validation [updateMailIndexByUserInfo] ========================");
		mailIndexResponse = mailIndexInputDTOValidation(updateMailIndexInfoList, BindingResult);
		logger.info("End MailIndex Parameter Validation [updateMailIndexByUserInfo] ========================");
		
		logger.info("End MailIndex Parameter Validation [updateMailIndexByUserInfo] ========================");
		
		mailIndexResponse.setRequestCnt("0");
		mailIndexResponse.setErrorCnt("0");
		mailIndexResponse.setReturnCode("00");
		mailIndexResponse.setReturnMessage("Success");
		
		
		return mailIndexResponse;	
	}
	
	
	
	//메일인덱스입력값 Validation
    public MailIndexResponseDTO.Response mailIndexInputDTOValidation(List<MailIndexDTO.UpdatebyUserInfoDTO> indexInfoList, BindingResult BindingResult) {
    	
    	MailIndexResponseDTO.Response mailIndexResponse = new MailIndexResponseDTO.Response();
    	
    	//입력필수값 체크 
		customCollectionValidator.validate(indexInfoList, BindingResult);				
		if (BindingResult.hasErrors()) {
			mailIndexResponse.setReturnCode("99");
			mailIndexResponse.setReturnMessage("입력필수값오류");
			mailIndexResponse.setRequestCnt("");
			mailIndexResponse.setErrorCnt("");
            return mailIndexResponse;
        }
		
		//날짜범위유효값 및 폴더ID리스트및메일SEQID유효값 체크
		List<HashMap<String,String>> dateList = new ArrayList<HashMap<String,String>>();		
		for(MailIndexDTO.UpdatebyUserInfoDTO indexInfo : indexInfoList) {
			HashMap<String,String> tempDateMap = new HashMap<String,String>();					
			
			//Recursive옵션및폴더ID유효값체크
			if(!indexInfo.getRecursive().isEmpty()) {
				if(indexInfo.getFolderlist().isEmpty()) {
					mailIndexResponse.setReturnCode("99");
					mailIndexResponse.setReturnMessage("Recursive옵션및폴더ID유효값오류");
					mailIndexResponse.setRequestCnt("");
					mailIndexResponse.setErrorCnt("");
		            return mailIndexResponse;
				}					
			}
			
			//Include옵션및폴더ID유효값체크
			if(!indexInfo.getInclude().isEmpty()) {
				if(indexInfo.getFolderlist().isEmpty()) {
					mailIndexResponse.setReturnCode("99");
					mailIndexResponse.setReturnMessage("Include옵션및폴더ID유효값오류");
					mailIndexResponse.setRequestCnt("");
					mailIndexResponse.setErrorCnt("");
		            return mailIndexResponse;
				}					
			}
			
			//Include옵션및폴더ID유효값체크
			if((!indexInfo.getGte().isEmpty()&&indexInfo.getLt().isEmpty())
				||(indexInfo.getGte().isEmpty()&&!indexInfo.getLt().isEmpty())){
					mailIndexResponse.setReturnCode("99");
					mailIndexResponse.setReturnMessage("날짜유효값오류");
					mailIndexResponse.setRequestCnt("");
					mailIndexResponse.setErrorCnt("");
		            return mailIndexResponse;				
			}
			
			
			//날짜 포맷 Validation 체크를위한 날짜데이터 저장
			tempDateMap.put("gte", indexInfo.getGte());
			tempDateMap.put("lt", indexInfo.getLt());
			dateList.add(tempDateMap);
		}
		
		
		//날짜포맷체크
		if(!formatValidator.checkDateList(dateList)) {
			mailIndexResponse.setReturnCode("99");
			mailIndexResponse.setReturnMessage("날짜포맷오류");
			mailIndexResponse.setRequestCnt("");
			mailIndexResponse.setErrorCnt("");
            return mailIndexResponse;
		};
	
		
		mailIndexResponse.setReturnCode("00");
		mailIndexResponse.setReturnMessage("Success");
		mailIndexResponse.setRequestCnt("");
		mailIndexResponse.setErrorCnt("");
		
		
		return mailIndexResponse;
    }
	
	
}
