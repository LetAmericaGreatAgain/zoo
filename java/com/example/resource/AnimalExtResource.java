package com.example.resource;

import com.example.domain.Animal;
import com.example.service.IAnimalExtService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.NonNull;

import java.util.List;


@Path("/api/animal/ext")
@Singleton
public class AnimalExtResource {

    private final IAnimalExtService animalExtService;

    @Inject
    public AnimalExtResource(IAnimalExtService animalExtService) {
        this.animalExtService = animalExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnimalList(@Context HttpHeaders httpHeaders) {
        List<Animal> animalList = animalExtService.customMethod();
        return Response.ok(animalList).build();
    }


}

