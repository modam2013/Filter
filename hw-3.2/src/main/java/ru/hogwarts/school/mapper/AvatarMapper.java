package ru.hogwarts.school.mapper;
import org.springframework.stereotype.Component;
import ru.hogwarts.school.dto.AvatarDto;
import ru.hogwarts.school.model.Avatar;
import ru.hogwarts.school.repository.AvatarRepository;


@Component
public class AvatarMapper {
    private AvatarRepository avatarRepository;
    private StudentMapper studentMapper;

    public AvatarMapper(AvatarRepository avatarRepository, StudentMapper studentMapper) {
        this.avatarRepository = avatarRepository;
        this.studentMapper = studentMapper;
    }

    public int toDto(Avatar avatar) {

        return AvatarDto.builder()
                .id()
                .length();
    }
}