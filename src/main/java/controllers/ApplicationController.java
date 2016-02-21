/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;
  
import models.Game;
import models.englishGame;
import models.spanishGame;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }
        
    public Result choice() {
      return Results.html().template("views/AcesUp/choice.flt.html");
    }
    
    public Result acesUp() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }
    public Result SPacesUp() {
        return Results.html().template("views/AcesUp/SPacesUp.flt.html");
    }

    public Result gameGet(Context context){
        Game g = new englishGame();
        g.shuffle();
        g.dealFour();
        return Results.json().render(g);
    }
    public Result SPgameGet(Context context){
        Game g = new spanishGame();
        g.shuffle();
        g.dealFour();
        return Results.json().render(g);
    }

    public Result dealPost(Context context, englishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }
    public Result SPdealPost(Context context, spanishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }
    public Result removeCard(Context context, @PathParam("column") int colNumber, englishGame g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }
    public Result SPremoveCard(Context context, @PathParam("column") int colNumber, spanishGame g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }


    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, englishGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }
    public Result SPmoveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, spanishGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }

}
