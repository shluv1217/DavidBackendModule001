package com.example.demo.dto.mail;


import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class MailIndexDTO {

    
    //UpdatebyUserInfoDTO
    @AllArgsConstructor
    @NoArgsConstructor
	@Getter
	@Setter
	@ToString
    @Builder
    public static class UpdatebyUserInfoDTO{
    	@NotBlank
        private String id;
        private String gte;
        private String lt;
        private String clean;
        private String recursive;
        private String include;
        private List<Integer> folderlist;
	}
    
    
    
    
    //DelbyUserInfoDTO
    @AllArgsConstructor
	@Getter
	@Setter
	@ToString
    @Builder
    public static class DelbyUserInfoDTO{
    	@NotBlank
		private String id;
		private List<String> mailIdlist;
	    private List<Integer> folderlist;
	    private List<Integer> mlSeqlist;
	}
    
    
    
    //DelbyMailInfoDTO
	@AllArgsConstructor
	@Getter
	@Setter
	@ToString
    @Builder
    public static class DelbyMailInfoDTO{
		@NotEmpty
	    private List<String> mailIdlist;
		@NotBlank
	    private String setcode;
	    private List<String> exUserIdist;
	}
	
	
	
    //DelbyDateInfoDTO
	@AllArgsConstructor
	@Getter
	@Setter
	@ToString
    @Builder
    public static class DelbyDateInfoDTO{
	    private String id;
	    private String gt;
	    private String gte;
	    private String lt;
	    private String lte;
	    private String setcode;
	    private List<String> exUserIdist;
	}
	
	
	//MailSyncDTO
	@AllArgsConstructor
    @NoArgsConstructor
	@Getter
	@Setter
	@ToString
    @Builder
    public static class MailSyncDTO {
		private List<String> idList;
	    private boolean metaYn;
	}

	
}


