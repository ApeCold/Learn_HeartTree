package cn.bsd.learn.hearttreelibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class TreeView extends View {
    private Tree tree;
    public TreeView(Context context) {
        super(context);
    }

    public TreeView(Context context,@Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TreeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        if(tree==null){
            tree = new Tree(getWidth(),getHeight());
        }
        tree.draw(canvas);
        postInvalidate();
    }
}
