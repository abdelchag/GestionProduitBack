package org.abdel.gestionproduit.back.services;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
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
	
	@RequestMapping(value = "/download",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE )
	public Response downloadFile(@Context HttpServletResponse response) throws IOException{
//		public ResponseEntity<InputStreamResource> downloadFile() throws IOException{
		File file = new File("D:\\Documents\\AttestationDroits.pdf");
//		String tmpdir = System.getProperty("java.io.tmpdir");
//		File f = File.createTempFile("pref", "suff");
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Content-Disposition", "attachment; filename=test.txt");
//		headers.set("Content-type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
//		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
//		headers.add("Pragma", "no-cache");
//        headers.add("Expires", "0");
//        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
//		ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(isr, headers, HttpStatus.OK);
//		return response;
		/*
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment; filename=test.pdf");
        response.setHeader("Content-type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
        ServletOutputStream outStream = response.getOutputStream();
        byte[] bbuf = new byte[(int) file.length() + 1024];
        FileInputStream in = new FileInputStream(file);
        int length = 0;
        while ((in != null) && ((length = in.read(bbuf)) != -1)) {
            outStream.write(bbuf, 0, length);
        }
        in.close();
        outStream.flush();
        return Response.ok().build();
		*/
		
		StreamingOutput fileStream =  new StreamingOutput()
        {
            @Override
            public void write(java.io.OutputStream output) throws IOException
            {
                    byte[] data = FileUtils.readFileToByteArray(file);
                    output.write(data);
                    output.flush();
            }
        };
		
        
        return Response
                .ok(fileStream, javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .header("content-disposition","attachment; filename = myfile.pdf")
                .build();
		
		/*
		 * Access-Control-Allow-Credentials: true
Access-Control-Allow-Origin: http://localhost:4200
Content-Type: application/octet-stream
Date: Sat, 30 Jun 2018 10:52:10 GMT
Transfer-Encoding: chunked
Vary: Origin
		 */
	}
	
}
