package vo1.chapter13;

import java.util.Objects;

public class MemberDTO {

    public String name;
    public String phone;
    public String email;

    public MemberDTO() {

    }

    public MemberDTO(String name) {
        this.name = name;
    }

    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO getMemberDTO() {
        MemberDTO dto = new MemberDTO();

        return dto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberDTO)) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return name.equals(memberDTO.name) &&
                phone.equals(memberDTO.phone) &&
                email.equals(memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}
