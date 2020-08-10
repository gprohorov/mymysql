package pro.edu.mymysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl {

    @Autowired
    CategoryRepository repository;

    @PostConstruct
    void init(){

        List<Category> categories = new ArrayList<>(
                Arrays.asList(

                        new Category("Fiction", "descr1"),
                        new Category("Documental", "it2"),
                        new Category("Fantasy", "i3"),
                        new Category("Poetry", "item4"),
                        new Category("Education", "item5")
                )
        );
        categories.forEach(System.out::println);
        repository.saveAll(categories);

    }
}
