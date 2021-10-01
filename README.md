# Spring Annotations

## Spring Core Annotations
* Dependency Injection
    * @[Autowired](https://github.com/IvanLepi/potential-sniffle/blob/main/core/src/main/java/dev/ivanlepi/autowiring/Book.java)
    * @Bean
    * @Qualifier
    * @Required
    * @Value
    * @DependsOn
    * @Lazy
    * @Lookup
    * @Primary
    * @Scope
* Context Config
    * @Profile
    * @Import
    * @ImportResource
    * @PropertySource(s)


## Spring Web Annotations
* Request
    * @RequestMapping
    * @RequestBody
    * @PathVariable
    * @RequestParam
    * @CookieValue
    * @RequestHeader
* Response
    * @ResponseBody
    * @ExceptionHandler
    * @ResponseStatus
* Other
    * @Controller
    * @RestController
    * @ModelAttribute
    * @CrossOrigin

## Spring Boot Annotations

* Core
    * @SpringBootApplication
    * @EnableAutoConfiguration
* Conditionals
    * @ConditionalOnClass
    * @ConditionalOnMissingClass
    * @ConditionalOnBean
    * @ConditionalOnMissingBean
    * @ConditionalOnProperty
    * @ConditionalOnResource
    * @ConditionalOnWebApplication
    * @ConditionalOnNotWebApplication
    * @ConditionalExpression
    * @Conditional

## Spring Scheduling Annotations

* @EnableAsync
* @EnableScheduling
* @Async
* @Scheduled
* @Schedules

## Spring Data Annotations

* Common
    * @Transactional
    * @NoRepositoryBean
    * @Param
    * @Id
    * @Transient
    * @CreatedBy @LastModifiedBy @CreatedDate @LastModifiedDate
* JPA
    * @Query
    * @Procedure
    * @Lock
    * @Modifying
    * @EnableJpaRepositories
* Mongo
    * @Document
    * @Field
    * @Query
    * @EnableMongoRepositories

## Spring Bean Annotations

* @ComponentScan
* @Component
* @Repository
* @Controller
* @Configuration