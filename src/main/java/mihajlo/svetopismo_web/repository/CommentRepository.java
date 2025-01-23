package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Comment;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CommentRepository extends Repository<Comment, Long> {
    Comment save(Comment comment);

    Optional<Comment> findById(Long id);
}
