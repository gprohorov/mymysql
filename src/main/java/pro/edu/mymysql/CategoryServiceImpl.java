package pro.edu.mymysql;

import org.springframework.stereotype.Service;
import pro.edu.mymysql.interfaces.IGenreService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements IGenreService {
    List<Genre> genres = new ArrayList<>(
            Arrays.asList(

                    new Genre("Fiction", "descr1"),
                    new Genre("Documental", "it2"),
                    new Genre("Fantasy", "i3"),
                    new Genre("Poetry", "item4"),
                    new Genre("Education", "item5")
            )
    );
/*

    @Autowired
    CategoryRepository repository;

    @PostConstruct
    void init(){


        categories.forEach(System.out::println);
        repository.saveAll(categories);

    }
*/

    @Override
    public Genre create(Genre genre) {

        genres.add(genre);
        return genre;
    }

    @Override
    public Genre get(String id) {


        return this.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Genre update(Genre genre) {
        return null;
    }

    @Override
    public Genre delete(String id) {
        return null;
    }

    @Override
    public List<Genre> getAll() {
        return genres ;
    }
}
