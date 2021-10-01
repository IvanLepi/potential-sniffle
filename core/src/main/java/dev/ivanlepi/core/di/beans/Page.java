
@Configuration // All methods annotated with @Bean must be in @Configuration classes.
public class Page {

    public Page() {
    }

    //Spring calls these methods when a new instance of the return type is required.
    @Bean
    Page page(){
        return new Page();
    }

    //The resulting bean has the same name as the factory method. If we want to name it differently,
    // we can do so with the name or the value arguments of this annotation
    @Bean("page")
    Page getPage(){
        return new Page();
    }

}