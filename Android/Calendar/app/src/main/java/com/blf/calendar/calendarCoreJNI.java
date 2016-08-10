/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.blf.calendar;

public class calendarCoreJNI {
  public final static native void CGPoint_x_set(long jarg1, CGPoint jarg1_, float jarg2);
  public final static native float CGPoint_x_get(long jarg1, CGPoint jarg1_);
  public final static native void CGPoint_y_set(long jarg1, CGPoint jarg1_, float jarg2);
  public final static native float CGPoint_y_get(long jarg1, CGPoint jarg1_);
  public final static native long new_CGPoint();
  public final static native void delete_CGPoint(long jarg1);
  public final static native void CGSize_width_set(long jarg1, CGSize jarg1_, float jarg2);
  public final static native float CGSize_width_get(long jarg1, CGSize jarg1_);
  public final static native void CGSize_height_set(long jarg1, CGSize jarg1_, float jarg2);
  public final static native float CGSize_height_get(long jarg1, CGSize jarg1_);
  public final static native long new_CGSize();
  public final static native void delete_CGSize(long jarg1);
  public final static native void CGRect_origin_set(long jarg1, CGRect jarg1_, long jarg2, CGPoint jarg2_);
  public final static native long CGRect_origin_get(long jarg1, CGRect jarg1_);
  public final static native void CGRect_size_set(long jarg1, CGRect jarg1_, long jarg2, CGSize jarg2_);
  public final static native long CGRect_size_get(long jarg1, CGRect jarg1_);
  public final static native long new_CGRect();
  public final static native void delete_CGRect(long jarg1);
  public final static native void SDate_year_set(long jarg1, SDate jarg1_, int jarg2);
  public final static native int SDate_year_get(long jarg1, SDate jarg1_);
  public final static native void SDate_month_set(long jarg1, SDate jarg1_, int jarg2);
  public final static native int SDate_month_get(long jarg1, SDate jarg1_);
  public final static native void SDate_day_set(long jarg1, SDate jarg1_, int jarg2);
  public final static native int SDate_day_get(long jarg1, SDate jarg1_);
  public final static native long new_SDate();
  public final static native void delete_SDate(long jarg1);
  public final static native void date_set(long jarg1, SDate jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void date_get_now(long jarg1, SDate jarg1_);
  public final static native boolean date_is_equal(long jarg1, SDate jarg1_, long jarg2, SDate jarg2_);
  public final static native int date_get_time_t(long jarg1, SDate jarg1_);
  public final static native void date_get_next_month(long jarg1, SDate jarg1_, int jarg2);
  public final static native void date_get_prev_month(long jarg1, SDate jarg1_, int jarg2);
  public final static native int date_get_week(long jarg1, SDate jarg1_);
  public final static native int date_get_month_of_day(int jarg1, int jarg2);
  public final static native int date_get_leap(int jarg1);
  public final static native int date_get_month_count_from_year_range(int jarg1, int jarg2);
  public final static native void date_map_index_to_year_month(long jarg1, SDate jarg1_, int jarg2, int jarg3);
  public final static native void SCalendar_size_set(long jarg1, SCalendar jarg1_, long jarg2, CGSize jarg2_);
  public final static native long SCalendar_size_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_date_set(long jarg1, SCalendar jarg1_, long jarg2, SDate jarg2_);
  public final static native long SCalendar_date_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_yearMonthSectionHeight_set(long jarg1, SCalendar jarg1_, float jarg2);
  public final static native float SCalendar_yearMonthSectionHeight_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_weekSectionHegiht_set(long jarg1, SCalendar jarg1_, float jarg2);
  public final static native float SCalendar_weekSectionHegiht_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_daySectionHeight_set(long jarg1, SCalendar jarg1_, float jarg2);
  public final static native float SCalendar_daySectionHeight_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_dayBeginIdx_set(long jarg1, SCalendar jarg1_, int jarg2);
  public final static native int SCalendar_dayBeginIdx_get(long jarg1, SCalendar jarg1_);
  public final static native void SCalendar_dayCount_set(long jarg1, SCalendar jarg1_, int jarg2);
  public final static native int SCalendar_dayCount_get(long jarg1, SCalendar jarg1_);
  public final static native long new_SCalendar();
  public final static native void delete_SCalendar(long jarg1);
  public final static native void calendar_init(long jarg1, SCalendar jarg1_, long jarg2, CGSize jarg2_, float jarg3, float jarg4);
  public final static native void calendar_set_year_month(long jarg1, SCalendar jarg1_, int jarg2, int jarg3);
  public final static native void calendar_get_year_month(long jarg1, SCalendar jarg1_, long jarg2, long jarg3);
  public final static native void calendar_get_year_month_section_rect(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_);
  public final static native void calendar_get_week_section_rect(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_);
  public final static native void calendar_get_day_section_rect(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_);
  public final static native void calendar_get_week_cell_rect(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_, int jarg3);
  public final static native void calendar_get_day_cell_rect(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_, int jarg3, int jarg4);
  public final static native void calendar_get_day_cell_rect_by_index(long jarg1, SCalendar jarg1_, long jarg2, CGRect jarg2_, int jarg3);
  public final static native int calendar_get_hitted_day_cell_index(long jarg1, SCalendar jarg1_, long jarg2, CGPoint jarg2_);
}