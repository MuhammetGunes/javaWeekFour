package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	
	

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getById(int id) {

		for (Language lang : languages) {
			if (lang.getId()==id) {
				return lang;
			}
		}
		return null;
	}

	@Override
	public void deleteLanguage(Language language) {
		Language deletedLanguage = getById(language.getId());
		languages.remove(deletedLanguage);
	}

	@Override
	public void addLanguage(Language language) {
		languages.add(language);
	}

	@Override
	public void updateLanguage(Language language) {
		Language updatedLanguage = getById(language.getId());
		updatedLanguage.setName(language.getName());
	}

}
