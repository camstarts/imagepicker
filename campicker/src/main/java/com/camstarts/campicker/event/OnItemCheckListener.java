package com.camstarts.campicker.event;

import com.camstarts.campicker.entity.Photo;

/**
 * Created by donglua on 15/6/20.
 */
public interface OnItemCheckListener {

  boolean onItemCheck(int position, Photo path, int selectedItemCount);

}
