package nl.xnagames.kingsvalley.explorer;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

import nl.xnagames.kingsvalley.animatedsprite.AnimatedSprite;

public class ExplorerIdleRight extends AnimatedSprite
{
	//Fields
	private Explorer explorer;
	
	
	//Properties
	
	
	//Constructor
	public ExplorerIdleRight(Explorer explorer)
	{
		super(explorer);
		this.explorer = explorer;
		this.initialize();
	}
	
	
	// Initialize
	public void initialize()
	{
		this.i = 4;
	}
	
	//Update
	public void update(float delta)
	{
		if (Gdx.input.isKeyPressed(Keys.RIGHT))
		{
			this.explorer.setState(this.explorer.getWalkRight());
		}
	}
	
	
	// Draw
	public void draw(float delta)
	{
		super.draw(delta);
	}
}
