package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id);
	void deleteLanguage(Language language);
	void addLanguage(Language language) throws Exception;
	void updateLanguage(Language language) throws Exception;
}
