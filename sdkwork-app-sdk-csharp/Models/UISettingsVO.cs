using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UISettingsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Theme { get; set; }
        public string? Language { get; set; }
        public string? FontSize { get; set; }
        public int? ZoomLevel { get; set; }
        public bool? NotificationsEnabled { get; set; }
        public bool? ShortcutsEnabled { get; set; }
        public string? SidebarState { get; set; }
        public bool? AutoSaveEnabled { get; set; }
    }
}
