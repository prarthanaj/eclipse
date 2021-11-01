package com.xworkz.foodexample.dao;

import com.xworkz.dto.foodexample.FoodDTO;
import com.xworkz.dto.foodexample.FoodTypes;

	public class FoodDAO {
		
		private FoodDTO[] foodContainer=new FoodDTO[4];
		private int count;
		private static int totalFoodItems;
		
		public FoodDAO()
		{
			System.out.println("invoke FoodDAO");
		}
		
		public void add(FoodDTO fooddto)
		{
			if(fooddto!=null && this.count<this.foodContainer.length)
			{
				this.foodContainer[count]=fooddto;
				System.out.println("added to fooddto".concat(String.valueOf(this.count))
						.concat(" ").concat("id").concat(String.valueOf(fooddto.getId())));
				this.count++;
			}
			else {
				System.err.println("container is full or have passed null");
			}
		}
		public void updatePriceByName(String name, double price)
		{
			if(name!=null && price>0)
			{
				for(int per=0; per<this.foodContainer.length;per++)
				{
					FoodDTO food=this.foodContainer[per];
					if(food!=null)
					{
						String nameOfFood=food.getName();
						if(nameOfFood.equals(name))
						{
							System.out.println("name found".concat(name).concat(" ").
									concat("updated price"));
							food.setPrice(price);
							System.out.println("updated".concat(String.valueOf(food.getPrice())));
						}
						else
						{
							System.out.println(" name matching");
						}
					}
				}
			}
		}
			public void updateQuantityByName(String name,int quantity)
			{
				if(name!=null && quantity>0)
				{
					for(int quantity1=0;quantity1<this.foodContainer.length;quantity1++)
					{
						FoodDTO food=this.foodContainer[quantity1];
						if(food!=null)
						{
						    String nameOfFood=food.getName();
							if(nameOfFood.equals(name))
							{
								System.out.println("name found".concat(name).concat(" ").
										concat("updated quantity"));
								food.setQuantity(quantity);
								System.out.println("updated".concat(String.valueOf(food.getQuantity())));
							}
							else
							{
								System.err.println(" name matching");
							}
						}
					}
				}
					}
				
				
				public void findByName(String name)
				{
					if(name!=null)
					{
						for (int given=0;given<this.foodContainer.length;given++)
						{
							FoodDTO food1=this.foodContainer[given];
							if(food1!=null)
							{
							    String names=food1.getName();
								if(names.equals(name))
								{
									System.out.println("name matched at".concat(String.valueOf(given)).concat(names));
								}
								else
								{
									System.err.println("name not matched or food cannot be null");
								}
						}
							
				}
				}
			}
				public void findByNameAndPrice(String names,double price)
				{
					if(names!=null && price>0)
					{
						for (int taken=0;taken<this.foodContainer.length;taken++)
						{
							FoodDTO food2=this.foodContainer[taken];
							if(food2!=null)
							{
							 String nameOfFood=food2.getName();
							 double priceOfFood=food2.getPrice();
							 if(nameOfFood.equals(names)&& price==priceOfFood)
							 {
									System.out.println("name and price matched, name:  ".concat(names).concat(" ")
											.concat(",price ").concat(String.valueOf(price)));


								}
							 else
							 {
								 System.err.println("name price not matched  or food cannot  be null");
							 }
							}
						}
					}
				}
				
				public void displayDetails()
				{
					for(int list=0;list<this.foodContainer.length;list++)
					{
						FoodDTO display=this.foodContainer[list];
						if(display!=null)
						{
						int displayID=display.getId();
						String displayName=display.getName();
						FoodTypes displayType=display.getType();
						double displayPrice=display.getPrice();
						int displayQuantity=display.getQuantity();
						System.out.println("id: "+displayID+" index: "+list);
						System.out.println("Name: "+displayName+" index: "+list);
						System.out.println("Type: "+displayType+" index: "+list);
						System.out.println("Price: "+displayPrice+" index: "+list);
						System.out.println("Quantity :"+displayQuantity+" index: "+list);

					}
				}
			}
				public void totalFoodItems()
				{
					for(int all=0;all<this.foodContainer.length;all++)
					{
						FoodDTO dto=foodContainer[all];
						if(dto!=null)
						{
							int totalItems=dto.getQuantity();
							FoodDAO.totalFoodItems=FoodDAO.totalFoodItems+totalItems;
						}

					}
					System.out.println("total food items: "+FoodDAO.totalFoodItems);
				}
			}
		
		




