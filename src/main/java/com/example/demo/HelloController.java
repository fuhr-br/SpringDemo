package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/formulario")
	public String index() {
		return "<form action=\"/pagina-processa-dados-do-form\" method=\"post\">\r\n<center>"
				+ "    <div>\r\n<br>"
				+ "        <label for=\"nome\">Nome:</label>\r\n"
				+ "        <input type=\"text\" id=\"nome\" name=\"usuario_nome\" />\r\n"
				+ "    </div>\r\n<br>"
				+ "    <div>\r\n"
				+ "        <label for=\"email\">E-mail:</label>\r\n"
				+ "        <input type=\"email\" id=\"email\" name=\"usuario_email\" />\r\n"
				+ "    </div>\r\n<br>"
				+ "    <div>\r\n"
				+ "        <label for=\"msg\">Mensagem:</label>\r\n"
				+ "       <higth> <textarea id=\"msg\" name=\"usuario_msg\"></textarea>\r\n</higth>"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <div class=\"button\">\r\n"
				+ "        <button type=\"submit\">Enviar sua mensagem</button></center>\r\n"
				+ "    </div>\r\n"
				+ "</form>";
	}

}