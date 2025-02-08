package com.example.resource;

import com.example.domain.Animal;
import com.example.service.IAnimalService;
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


@Path("/api/animal")
@Singleton
public class AnimalResource {

    private final IAnimalService animalService;

    @Inject
    public AnimalResource(IAnimalService animalService) {
        this.animalService = animalService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnimal(@NonNull @QueryParam("id") Integer id, @Context HttpHeaders httpHeaders) {
        Animal animal = animalService.selectAnimalById(id);
        return Response.ok(animal).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnimalList(Animal animal, @Context HttpHeaders httpHeaders) {
        List<Animal> animalList = animalService.selectAnimalList(animal);
        return Response.ok(animalList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postAnimal(@NonNull Animal animal, @Context HttpHeaders httpHeaders) {
        int i = animalService.insertAnimal(animal);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveAnimal(@NonNull Animal animal, @Context HttpHeaders httpHeaders) {
        int i = animalService.saveAnimalById(animal);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putAnimal(@NonNull Animal animal, @Context HttpHeaders httpHeaders) {
        int i = animalService.updateAnimal(animal);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAnimalById(@NonNull @QueryParam("id") Integer id, @Context HttpHeaders httpHeaders) {
        int i = animalService.deleteAnimalById(id);
        return Response.ok(i).build();
    }


}

