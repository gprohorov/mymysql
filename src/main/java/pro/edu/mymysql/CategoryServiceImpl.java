package pro.edu.mymysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.edu.mymysql.interfaces.ICategoryService;
import pro.edu.mymysql.interfaces.IGenericService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    List<Category> categories = new ArrayList<>(
            Arrays.asList(

                    new Category("Fiction", "descr1"),
                    new Category("Documental", "it2"),
                    new Category("Fantasy", "i3"),
                    new Category("Poetry", "item4"),
                    new Category("Education", "item5")
            )
    );

    @Autowired
    CategoryRepository repository;

    @PostConstruct
    void init(){


        categories.forEach(System.out::println);
        repository.saveAll(categories);

    }

    @Override
    public Category create(Category category) {
        return null;
    }

    @Override
    public Category get(String id) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public Category delete(String id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return categories ;
    }
}
