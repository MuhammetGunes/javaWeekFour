package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@Service
public class LanguageManager implements LanguageService{
	
	LanguageRepository languageRepository;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {

		return languageRepository.getById(id);
	}

	@Override
	public void deleteLanguage(Language language) {
		languageRepository.deleteLanguage(language);
	}

	@Override
	public void addLanguage(Language language) throws Exception {
		for(Language lang : getAll()) {
			if(lang.getName() == language.getName()) throw new Exception("Programlama dili aynı olamaz...");
			else if(language.getName().isBlank() || language.getName().isEmpty()) throw new Exception("Programlama dili boş olamaz...");
			else {
				languageRepository.addLanguage(language);
			}
		}
	}

	@Override
	public void updateLanguage(Language language) throws Exception {
		for(Language lang : getAll()) {
			if(lang.getName() == language.getName()) throw new Exception("Programlama dili aynı olamaz...");
			else if(language.getName().isBlank() || language.getName().isEmpty()) throw new Exception("Programlama dili boş olamaz...");
			else {
				languageRepository.updateLanguage(language);
			}
		}
		
	}

}
