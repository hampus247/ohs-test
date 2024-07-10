package com.test.integration;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.test.grpc.CreateUserRequest;
import com.test.grpc.UserResponse;
import com.test.grpc.UserServiceGrpc;
import com.test.user.User;
import io.grpc.stub.StreamObserver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadCSV extends UserServiceGrpc.UserServiceImplBase {

    public void processInputFile() {

        List<User> inputList = new ArrayList<User>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Paths.get("src\\main\\resources\\order-integration.csv").toFile())))) {

            inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());

            System.out.println(inputList);
        } catch (IOException ex) {
            ex.printStackTrace();
            //lägg till logger
        }
    }

    private final Function<String, User> mapToItem = (line) -> {

        String[] p = line.split(",");// a CSV has comma separated lines

        createUser(new CreateUserRequest(), new StreamObserver<UserResponse>() {
            @Override
            public void onNext(UserResponse userResponse) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        return User.builder().build();
    };

    public void CreateUser(com.test.grpc.CreateUserRequest request,
                           io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {

    }
}
