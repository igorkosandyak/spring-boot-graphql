package pac.repositories;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;
import pac.models.Article;

import java.util.List;

public interface ArticleRepository extends PagingAndSortingRepository<Article, ObjectId> {

    List<Article> findByIdIn(List<String> ids);
}
