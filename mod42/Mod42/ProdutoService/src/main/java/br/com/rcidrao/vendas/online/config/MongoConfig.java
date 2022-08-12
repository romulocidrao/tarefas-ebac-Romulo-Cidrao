/**
 * 
 */
package br.com.rcidrao.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Rômulo
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.rcidrao.vendas.online.repository")
public class MongoConfig {

}