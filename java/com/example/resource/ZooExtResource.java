package com.example.resource;

import com.example.domain.Zoo;
import com.example.service.IZooExtService;
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


@Path("/api/zoo/ext")
@Singleton
public class ZooExtResource {

    private final IZooExtService zooExtService;

    @Inject
    public ZooExtResource(IZooExtService zooExtService) {
        this.zooExtService = zooExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getZooList(@Context HttpHeaders httpHeaders) {
        List<Zoo> zooList = zooExtService.customMethod();
        return Response.ok(zooList).build();
    }


}

