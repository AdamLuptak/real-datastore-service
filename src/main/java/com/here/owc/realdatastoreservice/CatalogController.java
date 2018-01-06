package com.here.owc.realdatastoreservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @GetMapping("/partition")
    String getPartition() {
        return "saaaaadsdsdisdfsdfn sdfsfdprotobuf";
    }

    @GetMapping("/partitions/zip")
    String getPartitionsZip() {

        return "sdsdcomsdssdsddsdsdsdpressPorotobuff";
    }

    @GetMapping("/partition/tileList")
    String getPartitionTileList() {
        return "return Zipped parttions";
    }

    @PostMapping("/partition")
    String postPartition() {
        return "codsdsmpressPorotobuff";
    }

    @PostMapping("/partitions/zip")
    String postPartitionsZip() {
        return "compressPorotobuff";
    }
}
