package br.com.imersivus.apiprograminglang;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryLanguage extends MongoRepository<Language, String>{
	
}
