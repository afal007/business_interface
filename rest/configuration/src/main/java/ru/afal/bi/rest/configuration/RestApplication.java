package ru.afal.bi.rest.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("ru.afal.bi.rest.dal.model")
@SpringBootApplication(scanBasePackages = "ru.afal.bi.rest.*")
@EnableJpaRepositories("ru.afal.bi.rest.dal.dao")
public class RestApplication {
  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

//  @Bean
//  public LinkDiscoverers linkDiscoverers() {
//    List<LinkDiscoverer> plugins = new ArrayList<>();
//    plugins.add(new CollectionJsonLinkDiscoverer());
//    return new LinkDiscoverers(SimplePluginRegistry.of(plugins));
//  }
}

