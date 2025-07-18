package lk.ijse.gdse.smsbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Integer id;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
}
