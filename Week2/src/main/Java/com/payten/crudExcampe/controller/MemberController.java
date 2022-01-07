package com.payten.crudExcampe.controller;

import com.payten.crudExcampe.model.Member;
import com.payten.crudExcampe.model.Movie;
import com.payten.crudExcampe.model.MoviePoint;
import com.payten.crudExcampe.model.Watchlist;
import com.payten.crudExcampe.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Member Controller API Documents")
@RestController
@RequestMapping("/api/member")
public class MemberController {

    /**
     * Api test icin resources altında postman collection var
     */

    @Autowired //Injected service layer
    @ApiModelProperty(value = "injected service for operation")
    private MemberService service;

    @PostMapping("/starsMovie")
    @ApiOperation(value = "Member gives stars operation")
    public ResponseEntity<Member> giveStars(@RequestBody MoviePoint moviePoint) {
        return service.giveStarsMovie(moviePoint);
    }

    @PostMapping("/createWatchList")
    @ApiOperation(value = "create watchList operation")
    public ResponseEntity<Member> createWatchList(@RequestBody Watchlist watchlist) {
        return service.createWatchList(watchlist);
    }

    @PostMapping("/watchListAddMovie")
    @ApiOperation(value = "add movies to watchList operation")
    public ResponseEntity<Member> watchListAddMovie(@RequestBody Watchlist watchlist) {
        return service.watchListAddMovie(watchlist);
    }
}
