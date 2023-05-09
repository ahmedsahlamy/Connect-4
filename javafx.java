Group root =new Group();
        Scene scene=new Scene(root ,Color.BLACK);
        stage.setTitle("title!");
        stage.getIcons().add(new Image("https://cdn-icons.flaticon.com/png/512/3367/premium/3367465.png?token=exp=1648874452~hmac=e5d556f2e2e35ec555446cbc16899501"));

        stage.setWidth(500);
        stage.setHeight(700);
       stage.setResizable(false);
          stage.setX(1500);
          stage.setY(100);
		    stage.setFullScreen(true);
			
			
			 stage.setFullScreen(true);
          stage.setFullScreenExitHint("can't leave without press f");
         stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f"));
		 
		 
		  Text text =new Text();
        text.setText("hi iam here");
        text.setX(20);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.DARKGRAY);
        root.getChildren().add(text);
		
		
		Line line=new Line();
        line.setStartX(200);
        line.setStartY(300);
        line.setEndX(300);
        line.setEndY(200);
        //line.setStrokeWidth(10);
		 line.setStroke(Color.AQUAMARINE);
		 line.setOpacity(0.5);   // 50%
        line.setRotate(-45);
        root.getChildren().add(line);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		   stage.setScene(scene);
         stage.show();