package br.com.imersivus.apiprograminglang;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ControllerLanguage {

	@Autowired
	private RepositoryLanguage repository;

	@GetMapping("/languages")
	public List<Language> getLanguages() {
		List<Language> languages = repository.findAll();
		return languages;
	}
}
