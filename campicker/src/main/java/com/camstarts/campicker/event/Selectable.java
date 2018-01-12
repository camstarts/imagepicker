package com.camstarts.campicker.event;


import com.camstarts.campicker.entity.Photo;
/**
 * Created by donglua on 15/6/30.
 */
public interface Selectable {


  boolean isSelected(Photo photo);

  void toggleSelection(Photo photo);


  void clearSelection();

  int getSelectedItemCount();

}