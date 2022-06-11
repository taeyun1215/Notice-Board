package web.NoticeBoard.domain.post;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import web.NoticeBoard.domain.base.BaseEntity;
import web.NoticeBoard.domain.user.User;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(nullable = false, length = 50)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(length = 20)
    private String writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public Post(
            String title,
            String content,
            String writer,
            User user
    ) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.user = user;
    }

    public static Post createPost(Post post, User user) {
        return Post.builder()
                .title(post.getTitle())
                .content(post.getContent())
                .writer(post.getWriter())
                .user(user)
                .build();
    }

}
