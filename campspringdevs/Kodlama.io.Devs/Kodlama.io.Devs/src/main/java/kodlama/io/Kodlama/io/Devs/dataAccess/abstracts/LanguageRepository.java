package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageRepository {
	List<Language> getAll();
	Language getById(int id);
	void deleteLanguage(Language language);
	void addLanguage(Language language);
	void updateLanguage(Language language);
}
