using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AnnouncementQueryForm
    {
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? PageSize { get; set; }
        public int? PageNum { get; set; }
    }
}
