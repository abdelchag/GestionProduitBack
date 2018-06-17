package org.abdel.gestionproduit.back.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fileapi")
@CrossOrigin(value="*")
public class FileService {
	
	@RequestMapping(value = "/ping")
	public String ping(){
		return "wewe";
	}
	
	@RequestMapping(value = "/download",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InputStreamResource> downloadFile() throws IOException{
		File file = new File("D:\\Documents\\AttestationDroits.pdf");
		String tmpdir = System.getProperty("java.io.tmpdir");
		File f = File.createTempFile("pref", "suff");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Disposition", "attachment; filename=test.txt");
		headers.set("Content-type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
		ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(isr, headers, HttpStatus.OK);
		return response;
	}
	
}
