package com.test.user;

import lombok.*;

@Builder
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String supplierPid;
        private String creditCardNumber;
        private String creditCardType;
        private String orderId;
        private String productPid;
        private String shippingAddress;
        private String country;
        private String dateCreated;
        private String quantity;
        private String fullName;
        private String orderStatus;
}
