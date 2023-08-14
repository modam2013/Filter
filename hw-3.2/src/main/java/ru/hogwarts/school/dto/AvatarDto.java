package ru.hogwarts.school.dto;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvatarDto {
        private long id;

        private String filePath;

        private long fileSize;

        private String mediaType;

        private long studentId;

        public static Snippet builder() {

            return null;
        }


        public String getFilePath() {
                return filePath;
        }

        public void setFilePath(String filePath) {
                this.filePath = filePath;
        }

        public long getFileSize() {
                return fileSize;
        }

        public void setFileSize(long fileSize) {
                this.fileSize = fileSize;
        }

        public String getMediaType() {
                return mediaType;
        }

        public void setMediaType(String mediaType) {
                this.mediaType = mediaType;
        }

        public long getStudentId() {
                return studentId;
        }

        public void setStudentId(long studentId) {
                this.studentId = studentId;
        }
}

