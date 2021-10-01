package dev.ivanlepi.autowiring;


@Component
public class Book {
    Page page;

    //Constructor injection
    @Autowired
    Book(Page page) {
        this.page=page;
    }

    //Setter injection
    @Autowired
    void setPage(Page page){
        this.page = page;
    }

    // Field injection
    @Autowired
    Page page;
}
