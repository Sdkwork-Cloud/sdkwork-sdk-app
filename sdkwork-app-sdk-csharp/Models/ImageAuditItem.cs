using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageAuditItem
    {
        public string? Id { get; set; }
        public ImageAuditVO? AuditResult { get; set; }
    }
}
