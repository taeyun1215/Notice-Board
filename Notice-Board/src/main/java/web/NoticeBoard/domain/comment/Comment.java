package web.NoticeBoard.domain.comment;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import web.NoticeBoard.domain.post.Post;
import web.NoticeBoard.domain.user.User;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Lob
    @Column(nullable = false)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Builder
    public Comment(
            String comment,
            User user,
            Post post
    ) {
        this.comment = comment;
        this.user = user;
        this.post = post;
    }

    public static Comment createComment(Comment comment, User user, Post post) {
        return Comment.builder()
                .comment(comment.getComment())
                .user(user)
                .post(post)
                .build();
    }

}
