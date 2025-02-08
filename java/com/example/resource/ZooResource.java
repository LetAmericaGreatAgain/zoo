package com.example.resource;

import com.example.domain.Zoo;
import com.example.service.IZooService;
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


@Path("/api/zoo")
@Singleton
public class ZooResource {

    private final IZooService zooService;

    @Inject
    public ZooResource(IZooService zooService) {
        this.zooService = zooService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getZoo(@NonNull @QueryParam("zName") String zName, @NonNull @QueryParam("location") String location, @Context HttpHeaders httpHeaders) {
        Zoo zoo = zooService.selectZooByZNameAndLocation(zName, location);
        return Response.ok(zoo).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getZooList(Zoo zoo, @Context HttpHeaders httpHeaders) {
        List<Zoo> zooList = zooService.selectZooList(zoo);
        return Response.ok(zooList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postZoo(@NonNull Zoo zoo, @Context HttpHeaders httpHeaders) {
        int i = zooService.insertZoo(zoo);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveZoo(@NonNull Zoo zoo, @Context HttpHeaders httpHeaders) {
        int i = zooService.saveZooByZNameAndLocation(zoo);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putZoo(@NonNull Zoo zoo, @Context HttpHeaders httpHeaders) {
        int i = zooService.updateZoo(zoo);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteZooByZNameAndLocation(@NonNull @QueryParam("zName") String zName, @NonNull @QueryParam("location") String location, @Context HttpHeaders httpHeaders) {
        int i = zooService.deleteZooByZNameAndLocation(zName, location);
        return Response.ok(i).build();
    }


}

