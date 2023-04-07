package com.first.webapp.Util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;



@Component
public class EmailUtil {
 
	@Autowired
  JavaMailSender mailSender;
	
	public void sendEmail(String toAddress,String emailsubject,String emailbody) {
	 MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message);
		
		try {
			messageHelper.setTo(toAddress);
			messageHelper.setText(emailsubject);
			messageHelper.setSubject(emailsubject);
			mailSender.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
