//package CRUD.Config;
//
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//
//@Configuration
//@PropertySource("classpath:db.properties")
//@EnableTransactionManagement
//@ComponentScan(basePackages = {"CRUD"})
//public class AppConfig {
//
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.driver"));
//        dataSource.setUrl(env.getProperty("db.url"));
//        dataSource.setUsername(env.getProperty("db.username"));
//        dataSource.setPassword(env.getProperty("db.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean factory =
//                new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        factory.setDataSource(dataSource());
//        factory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        factory.setPackagesToScan("CRUD");
//        factory.setPersistenceUnitName("User.class");
//        //       factory.setPersistenceUnitName("myJpaPersistenceUnit");
//        Properties properties = new Properties();
//   //     properties.setProperty("javax.persistence.schema-generation.database.action", "create");
//        properties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//        properties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
//        factory.setJpaProperties(properties);
//        return factory;
//    }
//
////    @Bean
////    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
////        LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
////        lcemfb.setJpaVendorAdapter(getJpaVendorAdapter());
////        lcemfb.setDataSource(getDataSource());
////        lcemfb.setPersistenceUnitName("myJpaPersistenceUnit");
////        lcemfb.setPackagesToScan("com.concretepage.entity");
////        lcemfb.setJpaProperties(jpaProperties());
////        return lcemfb;
////    }
//
//
//    @Bean
//    public JpaTransactionManager jpaTransactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return transactionManager;
//    }
//
////    @Bean
////    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
////        return new PersistenceExceptionTranslationPostProcessor();
////    }
//
////    Properties additionalProperties() {
////        Properties properties = new Properties();
////        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
////        properties.setProperty("hibernate.show_sql", "true");
////
////        return properties;
//}
//
//
