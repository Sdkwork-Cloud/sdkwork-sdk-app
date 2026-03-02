using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextAuditItem
    {
        public string? Id { get; set; }
        public TextAuditVO? AuditResult { get; set; }
    }
}
