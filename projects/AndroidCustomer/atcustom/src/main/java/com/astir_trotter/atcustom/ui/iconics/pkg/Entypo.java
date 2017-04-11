/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.astir_trotter.atcustom.ui.iconics.pkg;

import android.content.Context;
import android.graphics.Typeface;

import com.astir_trotter.atcustom.ui.iconics.core.typeface.IIcon;
import com.astir_trotter.atcustom.ui.iconics.core.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class Entypo implements ITypeface {
    private static final String TTF_FILE = "entypo-font-v1.0.0.1.ttf";

    private static Typeface typeface = null;

    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(),
                        v.character);
            }
            mChars = aChars;
        }

        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "ent";
    }

    @Override
    public String getFontName() {
        return "Entypo";
    }

    @Override
    public String getVersion() {
        return "1.0.0.1";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();

        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }

        return icons;
    }

    @Override
    public String getAuthor() {
        return "Daniel Bruce";
    }

    @Override
    public String getUrl() {
        return "http://www.entypo.com/";
    }

    @Override
    public String getDescription() {
        return "411 carefully crafted premium pictograms by Daniel Bruce";
    }

    @Override
    public String getLicense() {
        return "CC BY-SA 4.0";
    }

    @Override
    public String getLicenseUrl() {
        return "https://creativecommons.org/licenses/by-sa/4.0/";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        ent_add_to_list('\ue900'),
        ent_classic_computer('\ue901'),
        ent_controller_fast_backward('\ue902'),
        ent_creative_commons_attribution('\ue903'),
        ent_creative_commons_noderivs('\ue904'),
        ent_creative_commons_noncommercial_eu('\ue905'),
        ent_creative_commons_noncommercial_us('\ue906'),
        ent_creative_commons_public_domain('\ue907'),
        ent_creative_commons_remix('\ue908'),
        ent_creative_commons_share('\ue909'),
        ent_creative_commons_sharealike('\ue90a'),
        ent_creative_commons('\ue90b'),
        ent_document_landscape('\ue90c'),
        ent_remove_user('\ue90d'),
        ent_warning('\ue90e'),
        ent_arrow_bold_down('\ue90f'),
        ent_arrow_bold_left('\ue910'),
        ent_arrow_bold_right('\ue911'),
        ent_arrow_bold_up('\ue912'),
        ent_arrow_down('\ue913'),
        ent_arrow_left('\ue914'),
        ent_arrow_long_down('\ue915'),
        ent_arrow_long_left('\ue916'),
        ent_arrow_long_right('\ue917'),
        ent_arrow_long_up('\ue918'),
        ent_arrow_right('\ue919'),
        ent_arrow_up('\ue91a'),
        ent_arrow_with_circle_down('\ue91b'),
        ent_arrow_with_circle_left('\ue91c'),
        ent_arrow_with_circle_right('\ue91d'),
        ent_arrow_with_circle_up('\ue91e'),
        ent_bookmark('\ue91f'),
        ent_bookmarks('\ue920'),
        ent_chevron_down('\ue921'),
        ent_chevron_left('\ue922'),
        ent_chevron_right('\ue923'),
        ent_chevron_small_down('\ue924'),
        ent_chevron_small_left('\ue925'),
        ent_chevron_small_right('\ue926'),
        ent_chevron_small_up('\ue927'),
        ent_chevron_thin_down('\ue928'),
        ent_chevron_thin_left('\ue929'),
        ent_chevron_thin_right('\ue92a'),
        ent_chevron_thin_up('\ue92b'),
        ent_chevron_up('\ue92c'),
        ent_chevron_with_circle_down('\ue92d'),
        ent_chevron_with_circle_left('\ue92e'),
        ent_chevron_with_circle_right('\ue92f'),
        ent_chevron_with_circle_up('\ue930'),
        ent_cloud('\ue931'),
        ent_controller_fast_forward('\ue932'),
        ent_controller_jump_to_start('\ue933'),
        ent_controller_next('\ue934'),
        ent_controller_paus('\ue935'),
        ent_controller_play('\ue936'),
        ent_controller_record('\ue937'),
        ent_controller_stop('\ue938'),
        ent_controller_volume('\ue939'),
        ent_dot_single('\ue93a'),
        ent_dots_three_horizontal('\ue93b'),
        ent_dots_three_vertical('\ue93c'),
        ent_dots_two_horizontal('\ue93d'),
        ent_dots_two_vertical('\ue93e'),
        ent_download('\ue93f'),
        ent_emoji_flirt('\ue940'),
        ent_flow_branch('\ue941'),
        ent_flow_cascade('\ue942'),
        ent_flow_line('\ue943'),
        ent_flow_parallel('\ue944'),
        ent_flow_tree('\ue945'),
        ent_install('\ue946'),
        ent_layers('\ue947'),
        ent_open_book('\ue948'),
        ent_resize_100('\ue949'),
        ent_resize_full_screen('\ue94a'),
        ent_save('\ue94b'),
        ent_select_arrows('\ue94c'),
        ent_sound_mute('\ue94d'),
        ent_sound('\ue94e'),
        ent_trash('\ue94f'),
        ent_triangle_down('\ue950'),
        ent_triangle_left('\ue951'),
        ent_triangle_right('\ue952'),
        ent_triangle_up('\ue953'),
        ent_uninstall('\ue954'),
        ent_upload_to_cloud('\ue955'),
        ent_upload('\ue956'),
        ent_add_user('\ue957'),
        ent_address('\ue958'),
        ent_adjust('\ue959'),
        ent_air('\ue95a'),
        ent_aircraft_landing('\ue95b'),
        ent_aircraft_take_off('\ue95c'),
        ent_aircraft('\ue95d'),
        ent_align_bottom('\ue95e'),
        ent_align_horizontal_middle('\ue95f'),
        ent_align_left('\ue960'),
        ent_align_right('\ue961'),
        ent_align_top('\ue962'),
        ent_align_vertical_middle('\ue963'),
        ent_archive('\ue964'),
        ent_area_graph('\ue965'),
        ent_attachment('\ue966'),
        ent_awareness_ribbon('\ue967'),
        ent_back_in_time('\ue968'),
        ent_back('\ue969'),
        ent_bar_graph('\ue96a'),
        ent_battery('\ue96b'),
        ent_beamed_note('\ue96c'),
        ent_bell('\ue96d'),
        ent_blackboard('\ue96e'),
        ent_block('\ue96f'),
        ent_book('\ue970'),
        ent_bowl('\ue971'),
        ent_box('\ue972'),
        ent_briefcase('\ue973'),
        ent_browser('\ue974'),
        ent_brush('\ue975'),
        ent_bucket('\ue976'),
        ent_cake('\ue977'),
        ent_calculator('\ue978'),
        ent_calendar('\ue979'),
        ent_camera('\ue97a'),
        ent_ccw('\ue97b'),
        ent_chat('\ue97c'),
        ent_check('\ue97d'),
        ent_circle_with_cross('\ue97e'),
        ent_circle_with_minus('\ue97f'),
        ent_circle_with_plus('\ue980'),
        ent_circle('\ue981'),
        ent_circular_graph('\ue982'),
        ent_clapperboard('\ue983'),
        ent_clipboard('\ue984'),
        ent_clock('\ue985'),
        ent_code('\ue986'),
        ent_cog('\ue987'),
        ent_colours('\ue988'),
        ent_compass('\ue989'),
        ent_copy('\ue98a'),
        ent_credit_card('\ue98b'),
        ent_credit('\ue98c'),
        ent_cross('\ue98d'),
        ent_cup('\ue98e'),
        ent_cw('\ue98f'),
        ent_cycle('\ue990'),
        ent_database('\ue991'),
        ent_dial_pad('\ue992'),
        ent_direction('\ue993'),
        ent_document('\ue994'),
        ent_documents('\ue995'),
        ent_drink('\ue996'),
        ent_drive('\ue997'),
        ent_drop('\ue998'),
        ent_edit('\ue999'),
        ent_email('\ue99a'),
        ent_emoji_happy('\ue99b'),
        ent_emoji_neutral('\ue99c'),
        ent_emoji_sad('\ue99d'),
        ent_erase('\ue99e'),
        ent_eraser('\ue99f'),
        ent_export('\ue9a0'),
        ent_eye('\ue9a1'),
        ent_feather('\ue9a2'),
        ent_flag('\ue9a3'),
        ent_flash('\ue9a4'),
        ent_flashlight('\ue9a5'),
        ent_flat_brush('\ue9a6'),
        ent_folder_images('\ue9a7'),
        ent_folder_music('\ue9a8'),
        ent_folder_video('\ue9a9'),
        ent_folder('\ue9aa'),
        ent_forward('\ue9ab'),
        ent_funnel('\ue9ac'),
        ent_game_controller('\ue9ad'),
        ent_gauge('\ue9ae'),
        ent_globe('\ue9af'),
        ent_graduation_cap('\ue9b0'),
        ent_grid('\ue9b1'),
        ent_hair_cross('\ue9b2'),
        ent_hand('\ue9b3'),
        ent_heart_outlined('\ue9b4'),
        ent_heart('\ue9b5'),
        ent_help_with_circle('\ue9b6'),
        ent_help('\ue9b7'),
        ent_home('\ue9b8'),
        ent_hour_glass('\ue9b9'),
        ent_image_inverted('\ue9ba'),
        ent_image('\ue9bb'),
        ent_images('\ue9bc'),
        ent_inbox('\ue9bd'),
        ent_infinity('\ue9be'),
        ent_info_with_circle('\ue9bf'),
        ent_info('\ue9c0'),
        ent_key('\ue9c1'),
        ent_keyboard('\ue9c2'),
        ent_lab_flask('\ue9c3'),
        ent_landline('\ue9c4'),
        ent_language('\ue9c5'),
        ent_laptop('\ue9c6'),
        ent_leaf('\ue9c7'),
        ent_level_down('\ue9c8'),
        ent_level_up('\ue9c9'),
        ent_lifebuoy('\ue9ca'),
        ent_light_bulb('\ue9cb'),
        ent_light_down('\ue9cc'),
        ent_light_up('\ue9cd'),
        ent_line_graph('\ue9ce'),
        ent_link('\ue9cf'),
        ent_list('\ue9d0'),
        ent_location_pin('\ue9d1'),
        ent_location('\ue9d2'),
        ent_lock_open('\ue9d3'),
        ent_lock('\ue9d4'),
        ent_log_out('\ue9d5'),
        ent_login('\ue9d6'),
        ent_loop('\ue9d7'),
        ent_magnet('\ue9d8'),
        ent_magnifying_glass('\ue9d9'),
        ent_mail('\ue9da'),
        ent_man('\ue9db'),
        ent_map('\ue9dc'),
        ent_mask('\ue9dd'),
        ent_medal('\ue9de'),
        ent_megaphone('\ue9df'),
        ent_menu('\ue9e0'),
        ent_message('\ue9e1'),
        ent_mic('\ue9e2'),
        ent_minus('\ue9e3'),
        ent_mobile('\ue9e4'),
        ent_modern_mic('\ue9e5'),
        ent_moon('\ue9e6'),
        ent_mouse('\ue9e7'),
        ent_music('\ue9e8'),
        ent_network('\ue9e9'),
        ent_new_message('\ue9ea'),
        ent_new('\ue9eb'),
        ent_news('\ue9ec'),
        ent_note('\ue9ed'),
        ent_notification('\ue9ee'),
        ent_old_mobile('\ue9ef'),
        ent_old_phone('\ue9f0'),
        ent_palette('\ue9f1'),
        ent_paper_plane('\ue9f2'),
        ent_pencil('\ue9f3'),
        ent_phone('\ue9f4'),
        ent_pie_chart('\ue9f5'),
        ent_pin('\ue9f6'),
        ent_plus('\ue9f7'),
        ent_popup('\ue9f8'),
        ent_power_plug('\ue9f9'),
        ent_price_ribbon('\ue9fa'),
        ent_price_tag('\ue9fb'),
        ent_print('\ue9fc'),
        ent_progress_empty('\ue9fd'),
        ent_progress_full('\ue9fe'),
        ent_progress_one('\ue9ff'),
        ent_progress_two('\uea00'),
        ent_publish('\uea01'),
        ent_quote('\uea02'),
        ent_radio('\uea03'),
        ent_reply_all('\uea04'),
        ent_reply('\uea05'),
        ent_retweet('\uea06'),
        ent_rocket('\uea07'),
        ent_round_brush('\uea08'),
        ent_rss('\uea09'),
        ent_ruler('\uea0a'),
        ent_scissors('\uea0b'),
        ent_share_alternitive('\uea0c'),
        ent_share('\uea0d'),
        ent_shareable('\uea0e'),
        ent_shield('\uea0f'),
        ent_shop('\uea10'),
        ent_shopping_bag('\uea11'),
        ent_shopping_basket('\uea12'),
        ent_shopping_cart('\uea13'),
        ent_shuffle('\uea14'),
        ent_signal('\uea15'),
        ent_sound_mix('\uea16'),
        ent_sports_club('\uea17'),
        ent_spreadsheet('\uea18'),
        ent_squared_cross('\uea19'),
        ent_squared_minus('\uea1a'),
        ent_squared_plus('\uea1b'),
        ent_star_outlined('\uea1c'),
        ent_star('\uea1d'),
        ent_stopwatch('\uea1e'),
        ent_suitcase('\uea1f'),
        ent_swap('\uea20'),
        ent_sweden('\uea21'),
        ent_switch('\uea22'),
        ent_tablet('\uea23'),
        ent_tag('\uea24'),
        ent_text_document_inverted('\uea25'),
        ent_text_document('\uea26'),
        ent_text('\uea27'),
        ent_thermometer('\uea28'),
        ent_thumbs_down('\uea29'),
        ent_thumbs_up('\uea2a'),
        ent_thunder_cloud('\uea2b'),
        ent_ticket('\uea2c'),
        ent_time_slot('\uea2d'),
        ent_tools('\uea2e'),
        ent_traffic_cone('\uea2f'),
        ent_tree('\uea30'),
        ent_trophy('\uea31'),
        ent_tv('\uea32'),
        ent_typing('\uea33'),
        ent_unread('\uea34'),
        ent_untag('\uea35'),
        ent_user('\uea36'),
        ent_users('\uea37'),
        ent_v_card('\uea38'),
        ent_video('\uea39'),
        ent_vinyl('\uea3a'),
        ent_voicemail('\uea3b'),
        ent_wallet('\uea3c'),
        ent_water('\uea3d'),
        ent_500px_with_circle('\uea3e'),
        ent_500px('\uea3f'),
        ent_basecamp('\uea40'),
        ent_behance('\uea41'),
        ent_creative_cloud('\uea42'),
        ent_dropbox('\uea43'),
        ent_evernote('\uea44'),
        ent_flattr('\uea45'),
        ent_foursquare('\uea46'),
        ent_google_drive('\uea47'),
        ent_google_hangouts('\uea48'),
        ent_grooveshark('\uea49'),
        ent_icloud('\uea4a'),
        ent_mixi('\uea4b'),
        ent_onedrive('\uea4c'),
        ent_paypal('\uea4d'),
        ent_picasa('\uea4e'),
        ent_qq('\uea4f'),
        ent_rdio_with_circle('\uea50'),
        ent_renren('\uea51'),
        ent_scribd('\uea52'),
        ent_sina_weibo('\uea53'),
        ent_skype_with_circle('\uea54'),
        ent_skype('\uea55'),
        ent_slideshare('\uea56'),
        ent_smashing('\uea57'),
        ent_soundcloud('\uea58'),
        ent_spotify_with_circle('\uea59'),
        ent_spotify('\uea5a'),
        ent_swarm('\uea5b'),
        ent_vine_with_circle('\uea5c'),
        ent_vine('\uea5d'),
        ent_vk_alternitive('\uea5e'),
        ent_vk_with_circle('\uea5f'),
        ent_vk('\uea60'),
        ent_xing_with_circle('\uea61'),
        ent_xing('\uea62'),
        ent_yelp('\uea63'),
        ent_dribbble_with_circle('\uea64'),
        ent_dribbble('\uea65'),
        ent_facebook_with_circle('\uea66'),
        ent_facebook('\uea67'),
        ent_flickr_with_circle('\uea68'),
        ent_flickr('\uea69'),
        ent_github_with_circle('\uea6a'),
        ent_github('\uea6b'),
        ent_google_with_circle('\uea6c'),
        ent_google('\uea6d'),
        ent_instagram_with_circle('\uea6e'),
        ent_instagram('\uea6f'),
        ent_lastfm_with_circle('\uea70'),
        ent_lastfm('\uea71'),
        ent_linkedin_with_circle('\uea72'),
        ent_linkedin('\uea73'),
        ent_pinterest_with_circle('\uea74'),
        ent_pinterest('\uea75'),
        ent_rdio('\uea76'),
        ent_stumbleupon_with_circle('\uea77'),
        ent_stumbleupon('\uea78'),
        ent_tumblr_with_circle('\uea79'),
        ent_tumblr('\uea7a'),
        ent_twitter_with_circle('\uea7b'),
        ent_twitter('\uea7c'),
        ent_vimeo_with_circle('\uea7d'),
        ent_vimeo('\uea7e'),
        ent_youtube_with_circle('\uea7f'),
        ent_youtube('\uea80');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new Entypo();
            }
            return typeface;
        }
    }
}
