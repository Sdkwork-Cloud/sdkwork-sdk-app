using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SharePosterForm
    {
        public string? ShareType { get; set; }
        public string? ShareId { get; set; }
        public string? Template { get; set; }
        public string? BackgroundColor { get; set; }
        public string? TextColor { get; set; }
        public bool? IncludeQrCode { get; set; }
        public string? CustomText { get; set; }
    }
}
