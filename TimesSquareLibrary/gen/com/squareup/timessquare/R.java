/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.squareup.timessquare;

public final class R {
    public static final class attr {
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_current_month=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_range_first=0x7f010003;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_range_last=0x7f010005;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_range_middle=0x7f010004;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_selectable=0x7f010000;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int state_today=0x7f010002;
    }
    public static final class color {
        public static int calendar_active_month_bg=0x7f040000;
        public static int calendar_bg=0x7f040001;
        public static int calendar_divider=0x7f040002;
        public static int calendar_inactive_month_bg=0x7f040003;
        public static int calendar_selected_day_bg=0x7f040004;
        public static int calendar_selected_range_bg=0x7f040005;
        public static int calendar_text_active=0x7f040007;
        public static int calendar_text_active_1=0x7f040008;
        public static int calendar_text_active_weekend=0x7f040009;
        public static int calendar_text_inactive=0x7f040006;
        public static int calendar_text_selected=0x7f04000a;
        public static int calendar_text_selector=0x7f04000c;
        public static int calendar_text_unselectable=0x7f04000b;
    }
    public static final class dimen {
        public static int calendar_day_headers_paddingbottom=0x7f050000;
        public static int calendar_month_title_bottommargin=0x7f050002;
        public static int calendar_month_topmargin=0x7f050001;
        public static int calendar_text_medium=0x7f050003;
        public static int calendar_text_small=0x7f050004;
    }
    public static final class drawable {
        public static int calendar_bg_selector=0x7f020000;
    }
    public static final class id {
        public static int calendar_grid=0x7f080001;
        public static int title=0x7f080000;
    }
    public static final class layout {
        public static int month=0x7f030000;
        public static int week=0x7f030001;
    }
    public static final class string {
        public static int day_name_format=0x7f060000;
        public static int invalid_date=0x7f060001;
        public static int month_name_format=0x7f060002;
    }
    public static final class style {
        /**      <item name="android:textAlignment">center</item> 
         */
        public static int CalendarCell=0x7f070001;
        public static int CalendarCell_CalendarDate=0x7f070004;
        public static int CalendarCell_DayHeader=0x7f070002;
        public static int CalendarCell_WeekendHeader=0x7f070003;
        public static int CalendarTitle=0x7f070000;
    }
    public static final class styleable {
        /** Attributes that can be used with a calendar_cell.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #calendar_cell_state_current_month com.squareup.timessquare:state_current_month}</code></td><td></td></tr>
           <tr><td><code>{@link #calendar_cell_state_range_first com.squareup.timessquare:state_range_first}</code></td><td></td></tr>
           <tr><td><code>{@link #calendar_cell_state_range_last com.squareup.timessquare:state_range_last}</code></td><td></td></tr>
           <tr><td><code>{@link #calendar_cell_state_range_middle com.squareup.timessquare:state_range_middle}</code></td><td></td></tr>
           <tr><td><code>{@link #calendar_cell_state_selectable com.squareup.timessquare:state_selectable}</code></td><td></td></tr>
           <tr><td><code>{@link #calendar_cell_state_today com.squareup.timessquare:state_today}</code></td><td></td></tr>
           </table>
           @see #calendar_cell_state_current_month
           @see #calendar_cell_state_range_first
           @see #calendar_cell_state_range_last
           @see #calendar_cell_state_range_middle
           @see #calendar_cell_state_selectable
           @see #calendar_cell_state_today
         */
        public static final int[] calendar_cell = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005
        };
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_current_month}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_current_month
        */
        public static final int calendar_cell_state_current_month = 1;
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_range_first}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_range_first
        */
        public static final int calendar_cell_state_range_first = 3;
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_range_last}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_range_last
        */
        public static final int calendar_cell_state_range_last = 5;
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_range_middle}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_range_middle
        */
        public static final int calendar_cell_state_range_middle = 4;
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_selectable}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_selectable
        */
        public static final int calendar_cell_state_selectable = 0;
        /**
          <p>This symbol is the offset where the {@link com.squareup.timessquare.R.attr#state_today}
          attribute's value can be found in the {@link #calendar_cell} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.squareup.timessquare:state_today
        */
        public static final int calendar_cell_state_today = 2;
    };
}
