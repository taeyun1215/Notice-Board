package web.NoticeBoard.domain.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import web.NoticeBoard.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "item")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 20)
    private String userName;

    @Column(unique = true, length = 50, nullable = false)
    private String email;

    @Column(length = 50)
    private String password;

    @Column(length = 20)
    private String nickname;

    @Builder
    public User(
            String userName,
            String email,
            String password,
            String nickname
    ) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public static User createUser(User user) {
        return User.builder()
                .userName(user.getUserName())
                .email(user.getEmail())
                .password(user.getPassword())
                .nickname(user.getNickname())
                .build();
    }

}
