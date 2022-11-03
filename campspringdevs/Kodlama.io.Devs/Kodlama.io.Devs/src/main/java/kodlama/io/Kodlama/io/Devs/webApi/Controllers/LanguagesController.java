package kodlama.io.Kodlama.io.Devs.webApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) {
		return languageService.getById(id);
	}	
	
	@DeleteMapping("/delete")
	public void deleteLanguage(Language language) {
		languageService.deleteLanguage(language);
	}
	
	@PostMapping("/add")
	public void addLanguage(@RequestBody Language language) throws Exception {
		languageService.addLanguage(language);
	}
	
	@PostMapping("/update")
	public void updateLanguage(@RequestBody Language language) throws Exception {
		languageService.updateLanguage(language);
	}
}




