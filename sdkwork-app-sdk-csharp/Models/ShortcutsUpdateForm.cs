using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShortcutsUpdateForm
    {
        public List<ShortcutItemForm>? Shortcuts { get; set; }
    }
}
